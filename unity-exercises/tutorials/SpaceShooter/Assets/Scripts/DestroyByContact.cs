using UnityEngine;
using System.Collections;

public class DestroyByContact : MonoBehaviour
{

	private GameController gameController;
	public GameObject explosion;
	public GameObject playerExplosion;
	public int scoreValue;

	void Start ()
	{
		GameObject obj = GameObject.FindGameObjectWithTag ("GameController");
		if (obj != null) {
			gameController = obj.GetComponent<GameController> ();
		}
		if (gameController == null) {
			Debug.Log ("Cannot find instance of GameController");
		}
	}

	void OnTriggerEnter (Collider other)
	{
		if (other.tag == "Boundary") {
			return;
		}
		if (other.tag == "Player") {
			Instantiate (playerExplosion, other.transform.position, other.transform.rotation);
			gameController.GameOver ();
		}
		if (other.tag == "Bolt") {
			Instantiate (explosion, transform.position, transform.rotation);
			gameController.AddScore (scoreValue);
		}
		Destroy (gameObject);
		Destroy (other.gameObject);
	}
}
