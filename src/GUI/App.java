package GUI;



/**
 * This class encapsulate the AWT thread, in order to hide it
 * from the main call.
 * 
 * @see main.Main
 * @author Corentin Legros
 */
class App implements Runnable {
	
	MainWindowView appView;
	
	public void run() {
		 appView = new MainWindowView();
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		appView = null;
	}
}