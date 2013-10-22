package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TurtleState extends JSplitPane{	
    private ActionListener myActionListener;
    private JTextArea myInfo;
    private JTextArea myPrevCommands;
    private View myView;
	public TurtleState(JScrollPane myOutputPane, JScrollPane myDoneCommandsPane, View v, JTextArea myDoneCommands, JTextArea myOutput)
	{
		setOrientation(VERTICAL_SPLIT);
		setTopComponent(myDoneCommandsPane);
		setBottomComponent(myOutputPane);
		setOneTouchExpandable(true);
		myView = v;
		myInfo = myOutput;
		myInfo.setLineWrap(true);
		myPrevCommands = myDoneCommands;
	}
	public void addText(String text)
	{
		myInfo.append(text + "\n");
	}
	public String getContents()
	{
		return myInfo.getText();
	}
}
