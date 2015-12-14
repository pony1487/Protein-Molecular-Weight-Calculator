import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AminoAcid extends JFrame{
	
	//screan dimensions
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	//for GUI
	private JLabel userInputL, molecularWeightL, averageWeightL;
	private JTextField userInputTF, mwTF, averageWeightTF;
	private JButton calculateB, exitB;
	
	//Button handlers:
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	public AminoAcid()
	{
		userInputL = new JLabel("Enter the Protein Sequence: ", SwingConstants.RIGHT);
		
		molecularWeightL = new JLabel("MW monoisotopic result: ", SwingConstants.RIGHT);
		
		averageWeightL = new JLabel("MW average result: ", SwingConstants.RIGHT);
		
		userInputTF = new JTextField(10);
		
		mwTF = new JTextField(10);
		
		averageWeightTF = new JTextField(10);
		
		//SPecify handlers for each button and add (register) ActionListeners to each button.
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		setTitle("Molecular Weight Program V1.00");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 2));
		
		//Add things to the pane in the order you want them to appear (left to right, top to bottom)
		pane.add(userInputL);
		pane.add(userInputTF);
		
		pane.add(molecularWeightL);
		pane.add(mwTF);
		
		pane.add(averageWeightL);
		pane.add(averageWeightTF);
		
		pane.add(calculateB);
		pane.add(exitB);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
	
			//Take what is typed and store it in result and average
			double result = mWeight(userInputTF.getText());
			double average = averageWeight(userInputTF.getText());
			
			mwTF.setText("" + result);
			averageWeightTF.setText("" + average);
		}
	}
	
	public class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args)
	{
		AminoAcid GUI = new AminoAcid();
		
	}
	
	public static double mWeight(String userInput)
	{
		double molecTotal = 18.0152;
		
		
		char charArray[] = userInput.toCharArray();
		
		
		for(int i = 0; i < userInput.length(); i++)
		{
			char temp = charArray[i];
			
			switch(temp)
			{
			case 'A':
				{
					molecTotal += 71.03711;
					break;
				}
			case 'R':
				{
					molecTotal += 156.10111;
					break;
				}
			case 'N':
				{
					molecTotal += 114.04293;
					break;
				}
			case 'D':
				{
					molecTotal += 115.02694;
					break;
				}
			case 'C':
				{
					molecTotal +=103.00919;
					break;
				}
			case 'E':
				{
					molecTotal += 129.04259;
					break;
				}
			case 'Q':
				{
					molecTotal += 128.05858;
					break;
				}
			case 'G':
				{
					molecTotal += 57.02146;
					break;
				}
			case 'H':
				{
					molecTotal += 137.05891;
					break;
				}
			case 'I':
				{
					molecTotal += 113.08406;
					break;
				}
			case 'L':
				{
					molecTotal += 113.08406;
					break;
				}
			case 'K':
				{
					molecTotal += 128.09496;
					break;
				}
			case 'M':
				{
					molecTotal += 131.04049;
					break;
				}
			case 'F':
				{
					molecTotal += 147.06841;
					break;
				}
			case 'P':
				{
					molecTotal += 97.05276;
					break;
				}
			case 'S':
				{
					molecTotal += 87.03203;
					break;
				}
			case 'T':
				{
					molecTotal += 101.04768;
					break;
				}
			case 'W':
				{
					molecTotal += 186.07931;
					break;
				}
			case 'Y':
				{
					molecTotal += 163.06333;
					break;
				}
			case 'V':
				{
					molecTotal += 99.06841;
					break;
				}
			default:
				{
					System.out.println("ERROR, UNKNOWN CHAR");
				}
			
			}//switch end
		}//for loop end
		
		return molecTotal;
		
	}//function end
	
	public static double averageWeight(String userInput)
	{
		double averageWeight = 18.01528;
		
		
		char charArray[] = userInput.toCharArray();
		
		
		for(int i = 0; i < userInput.length(); i++)
		{
			char temp = charArray[i];
			
			switch(temp)
			{
			case 'A':
				{
					averageWeight += 71.0779;
					break;
				}
			case 'R':
				{
					averageWeight += 156.1857;
					break;
				}
			case 'N':
				{
					averageWeight += 114.1026;
					break;
				}
			case 'D':
				{
					averageWeight += 115.0874;
					break;
				}
			case 'C':
				{
					averageWeight +=103.1429;
					break;
				}
			case 'E':
				{
					averageWeight += 129.114;
					break;
				}
			case 'Q':
				{
					averageWeight += 128.1292;
					break;
				}
			case 'G':
				{
					averageWeight += 57.0513;
					break;
				}
			case 'H':
				{
					averageWeight += 137.1393;
					break;
				}
			case 'I':
				{
					averageWeight += 113.1576;
					break;
				}
			case 'L':
				{
					averageWeight += 113.1576;
					break;
				}
			case 'K':
				{
					averageWeight += 128.1723;
					break;
				}
			case 'M':
				{
					averageWeight += 131.1961;
					break;
				}
			case 'F':
				{
					averageWeight += 147.1739;
					break;
				}
			case 'P':
				{
					averageWeight += 97.1152;
					break;
				}
			case 'S':
				{
					averageWeight += 87.0773;
					break;
				}
			case 'T':
				{
					averageWeight += 101.1039;
					break;
				}
			case 'W':
				{
					averageWeight += 186.2099;
					break;
				}
			case 'Y':
				{
					averageWeight += 163.1733;
					break;
				}
			case 'V':
				{
					averageWeight += 99.1311;
					break;
				}
			default:
				{
					System.out.println("ERROR, UNKNOWN CHAR");
				}
			
			}//switch end
		}//for loop end
		
		return averageWeight;
		
	}//function end
}//class end

