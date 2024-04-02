import controller.MainController;
import view.MainFrame;
/**
 * 
 * @author Martin Klestil
 * Start der App
 *
 */
public class App {
	public static void main(String[] args) {

		//View
		MainFrame mainFrame = new MainFrame();

		//Controller
		MainController mainController = new MainController(mainFrame);
	}
}
