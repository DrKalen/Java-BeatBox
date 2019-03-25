import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox {
  
  JPanel mainPanel;
  ArrayList<JCheckBox> checkboxList;
  Sequencer sequencer;
  Track track;
  JFrame theFrame;

 String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-Mid Tom", "High Agogo", "Open Hi Conga"};
  int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

  public static void main (String[] args) {
	new BeatBox().buildGUI();
  }

  public void buildGUI() {
	theFrame = new JFrame("Kalen's BeatBox");
	theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	BorderLayout layout = new BorderLayout();
	JPanel background = new JPanel(layout);
	background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


	theFrame.setBounds(50,50,300,300);
	theFrame.pack();
	theFrame.setVisible(true);
  }
}