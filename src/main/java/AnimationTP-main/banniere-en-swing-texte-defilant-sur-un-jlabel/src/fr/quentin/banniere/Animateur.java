package fr.quentin.banniere;

public class Animateur extends Thread {

	private Banniere banniere;
	private boolean actif=true;

	public Animateur(Banniere banniere){
		this.banniere=banniere;
	}

	@Override
	public void run(){
		while(actif){
			try {
				Thread.sleep(100);
				banniere.avancer();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
