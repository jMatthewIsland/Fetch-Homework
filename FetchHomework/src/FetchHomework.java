import java.io.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class FetchHomework {
	public static void type (String word) {
		char letter;
		try {
			Robot robot = new Robot();
			robot.delay(200);
			for (int i = 0; i < word.length(); i ++) {
				letter = word.charAt(i);
				Boolean command = false;
				switch (letter) {
				case 'a':
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					break;
				case 'b':
					robot.keyPress(KeyEvent.VK_B);
					robot.keyRelease(KeyEvent.VK_B);
					break;
				case 'c':
					robot.keyPress(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_C);
					break;
				case 'd':
					robot.keyPress(KeyEvent.VK_D);
					robot.keyRelease(KeyEvent.VK_D);
					break;
				case 'e':
					robot.keyPress(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_E);
					break;
				case 'f':
					robot.keyPress(KeyEvent.VK_F);
					robot.keyRelease(KeyEvent.VK_F);
					break;
				case 'g':
					robot.keyPress(KeyEvent.VK_G);
					robot.keyRelease(KeyEvent.VK_G);
					break;
				case 'h':
					robot.keyPress(KeyEvent.VK_H);
					robot.keyRelease(KeyEvent.VK_H);
					break;
				case 'i':
					robot.keyPress(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_I);
					break;
				case 'j':
					robot.keyPress(KeyEvent.VK_J);
					robot.keyRelease(KeyEvent.VK_J);
					break;
				case 'k':
					robot.keyPress(KeyEvent.VK_K);
					robot.keyRelease(KeyEvent.VK_K);
					break;
				case 'l':
					robot.keyPress(KeyEvent.VK_L);
					robot.keyRelease(KeyEvent.VK_L);
					break;
				case 'm':
					robot.keyPress(KeyEvent.VK_M);
					robot.keyRelease(KeyEvent.VK_M);
					break;
				case 'n':
					robot.keyPress(KeyEvent.VK_N);
					robot.keyRelease(KeyEvent.VK_N);
					break;
				case 'o':
					robot.keyPress(KeyEvent.VK_O);
					robot.keyRelease(KeyEvent.VK_O);
					break;
				case 'p':
					robot.keyPress(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_P);
					break;
				case 'q':
					robot.keyPress(KeyEvent.VK_Q);
					robot.keyRelease(KeyEvent.VK_Q);
					break;
				case 'r':
					robot.keyPress(KeyEvent.VK_R);
					robot.keyRelease(KeyEvent.VK_R);
					break;
				case 's':
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_S);
					break;
				case 't':
					robot.keyPress(KeyEvent.VK_T);
					robot.keyRelease(KeyEvent.VK_T);
					break;
				case 'u':
					robot.keyPress(KeyEvent.VK_U);
					robot.keyRelease(KeyEvent.VK_U);
					break;
				case 'v':
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					break;
				case 'w':
					robot.keyPress(KeyEvent.VK_W);
					robot.keyRelease(KeyEvent.VK_W);
					break;
				case 'x':
					robot.keyPress(KeyEvent.VK_X);
					robot.keyRelease(KeyEvent.VK_X);
					break;
				case 'y':
					robot.keyPress(KeyEvent.VK_Y);
					robot.keyRelease(KeyEvent.VK_Y);
					break;
				case 'z':
					robot.keyPress(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_Z);
					break;
				case ' ':
					robot.keyPress(KeyEvent.VK_SPACE);
					robot.keyRelease(KeyEvent.VK_SPACE);
					break;
				case '/':
					robot.keyPress(KeyEvent.VK_SLASH);
					robot.keyRelease(KeyEvent.VK_SLASH);
					break;
				case ':':
					robot.keyPress(KeyEvent.VK_COLON);
					robot.keyPress(KeyEvent.VK_COLON);
					break;
				case '.':
					robot.keyPress(KeyEvent.VK_PERIOD);
					robot.keyPress(KeyEvent.VK_PERIOD);
					break;
				case '1':
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					break;
				case '2':
					robot.keyPress(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_2);
					break;
				case '3':
					robot.keyPress(KeyEvent.VK_3);
					robot.keyRelease(KeyEvent.VK_3);
					break;
				case '4':
					robot.keyPress(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_4);
					break;
				case '5':
					robot.keyPress(KeyEvent.VK_5);
					robot.keyRelease(KeyEvent.VK_5);
					break;
				case '6':
					robot.keyPress(KeyEvent.VK_6);
					robot.keyRelease(KeyEvent.VK_6);
					break;
				case '7':
					robot.keyPress(KeyEvent.VK_7);
					robot.keyRelease(KeyEvent.VK_7);
					break;
				case '8':
					robot.keyPress(KeyEvent.VK_8);
					robot.keyRelease(KeyEvent.VK_8);
					break;
				case '9':
					robot.keyPress(KeyEvent.VK_9);
					robot.keyRelease(KeyEvent.VK_9);
					break;
				case '0':
					robot.keyPress(KeyEvent.VK_0);
					robot.keyRelease(KeyEvent.VK_0);
					break;
				case '_':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_MINUS);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					robot.keyRelease(KeyEvent.VK_MINUS);
					break;
					
				case '[':   //special commands
					switch (word.substring(word.indexOf('['), word.indexOf(']'))) {
					case "[enter":
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						i += 6; //skips over "enter" NUMBER IS ALWAYS 1 MORE THAN THE LENGTH OF THE COMMAND NAME
						break;
					case "[command":
						robot.keyPress(KeyEvent.VK_META);
						i += 7;
					}
				case ']':
					//do nothing
				break;
				default:
					System.out.println("err on character: " + word.charAt(i) + " for string + " + word);
					break;
				}
				robot.delay(100);
			}
		} catch (AWTException e) {
			System.err.println(e);
		}
	}
	public static void openChrome () {
		try {
			Color highlight = new Color(209, 230, 254);
			int highlightR,highlightG,highlightB;
			int urlR,urlG,urlB;
			Robot robot = new Robot();
			robot.delay(1000);
			//robot.mouseMove(26, 10);
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.delay(500);
			type("google chrome[enter]");
			robot.delay(1000);
			robot.mouseMove(400, 0);
			robot.delay(500);
			robot.mouseMove(378, 68);
			Color url = robot.getPixelColor(378,  68);
				highlightR = highlight.getRed(); highlightG = highlight.getGreen(); highlightB = highlight.getBlue();
				urlR = url.getRed(); urlG = url.getGreen(); urlB = url.getBlue();
			if ((urlR != highlightR) && (urlG != highlightG) && (urlB != highlightB)) {
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			}


			
			
			
			

		} catch (AWTException e) {
			System.err.println(e);
		}
		
	}
	
	public static void getHomework() {
		String chapter;
		String homeworkLetter;
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		Rectangle testRect = new Rectangle(14,427);
		try{
			Robot robot = new Robot();
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.delay(500);
					chapter = "12";  homeworkLetter = "a" ;
			String homeworkName = "chw_" + chapter + homeworkLetter;
			type(homeworkName);
			robot.delay(1000);
			type("[enter]");
			robot.delay(5000);
			
			if (screenRect.width == 1280 && screenRect.height == 800) {
				robot.mouseMove(408,10);
				robot.mousePress(InputEvent.BUTTON1_MASK);  //To view menu
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.mouseMove(438, 445);
				robot.mousePress(InputEvent.BUTTON1_MASK);  //To full screen
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(2000);
				robot.mouseMove(90, 20);
				robot.mousePress(InputEvent.BUTTON1_MASK); //To zoom menu
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(500);
				robot.mouseMove(100, 64);
				robot.mousePress(InputEvent.BUTTON1_MASK); //To 50%
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(1000);
				BufferedImage capture = new Robot().createScreenCapture(screenRect);
				ImageIO.write(capture, "bmp", new File("screen"));
				robot.mouseMove(90, 20);
				robot.mousePress(InputEvent.BUTTON1_MASK); //To zoom menu
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(500);
				robot.mouseMove(100, 136);
				robot.mousePress(InputEvent.BUTTON1_MASK);  //To 150%
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
			}
			else if (screenRect.width == 1920 && screenRect.height == 1080) {
				System.out.println("Screen 2");
				robot.mouseMove(405, 10);
				robot.mousePress(InputEvent.BUTTON1_MASK);  //To view menu
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.mouseMove(492, 448);
				robot.mousePress(InputEvent.BUTTON1_MASK);  //To full screen
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(2000);
				robot.mouseMove(90, 20);
				robot.mousePress(InputEvent.BUTTON1_MASK); //To zoom menu
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(500);
				robot.mouseMove(128, 80);
				robot.mousePress(InputEvent.BUTTON1_MASK); //To 75%
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(1000);
				robot.mouseMove(453, 400);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(500);
				BufferedImage capture = new Robot().createScreenCapture(screenRect);
				ImageIO.write(capture, "bmp", new File("screen"));
				robot.mouseMove(90, 20);
				robot.mousePress(InputEvent.BUTTON1_MASK); //To zoom menu
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(500);
				robot.mouseMove(100, 136);
				robot.mousePress(InputEvent.BUTTON1_MASK);  //To 150%
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				
			}
			
			}catch (AWTException e) {
				System.err.println(e);
			}
			catch (IOException er) {
				System.err.println(er);
			}
		
		
	}
	
	public static void main(String [] args) {
		getHomework();
		openChrome();
		
	}
	
	
}