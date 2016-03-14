using UnityEngine;
using System.Collections;

public class GameController : MonoBehaviour
{

	public GameObject hazard;
	public Vector3 spawnValue;
	public int hazardCount;
	public float spawnWait, waveWait;
	public GUIText scoreText, restartText, gameOverText;

	private int score;
	private bool gameOver, restart;

	void Start ()
	{
		StartCoroutine (SpawnWaves ());
		score = 0;
		UpdateScore ();
		gameOver = false;
		restart = false;
		restartText.text = "";
		gameOverText.text = "";
	}

	IEnumerator SpawnWaves ()
	{
		while (true) {
			for (int i = 0; i < hazardCount; i++) {
				Vector3 spawnPosition = new Vector3 (Random.Range (-spawnValue.x, spawnValue.x), 0.0f, spawnValue.z);
				Quaternion spawnRotation = Quaternion.identity;
				Instantiate (hazard, spawnPosition, spawnRotation);
				yield return new WaitForSeconds (spawnWait);
			}
			yield return new WaitForSeconds (waveWait);
			if (gameOver) {
				restartText.text = "Press 'R' for Restart.";
				restart = true;
				break;
			}
		}
	}

	void Update ()
	{
		UpdateScore ();
		if (restart) {
			if (Input.GetKeyDown (KeyCode.R)) {
				Application.LoadLevel (Application.loadedLevel);
			}
		}
	}

	void UpdateScore ()
	{
		scoreText.text = "Score: " + score;
	}

	public void AddScore (int scoreValue)
	{
		score += scoreValue;
	}

	public void GameOver ()
	{
		gameOverText.text = "Game Over!";
		gameOver = true;
	}
}
