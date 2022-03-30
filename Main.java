import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.event.*; 

class Main extends JFrame{ 
  private JTextArea ta = new JTextArea(5, 5); 
  private JScrollPane sp = new JScrollPane(ta); 
  private JSlider slider = new JSlider(0,100,0); 
  private String text = null; 
  
  public Main(){ /
    setTitle("Homework 3"); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    Container c = getContentPane(); 
    c.setLayout(null); 
    
    c.add(sp); 
    c.add(slider); 

    sp.setLocation(5,0); 
    sp.setSize(300,200); 
    slider.setLocation(0,200); 
    slider.setSize(300,50); 
 
    slider.setMajorTickSpacing(20); 
    slider.setMinorTickSpacing(10); 
    slider.setPaintLabels(true); 
    slider.setPaintTicks(true); 

    slider.addChangeListener(new ChangeListener(){ 
      public void stateChanged(ChangeEvent e) { 
        JSlider s = (JSlider) e.getSource(); 
        if(text.length() < s.getValue()){ 
          s.setValue(text.length()); 
        }          
        else { 
        	ta.setText(text.substring(0,s.getValue())); 
        } 
      } 
    }); 
    
    ta.addKeyListener(new KeyAdapter(){  
      public void keyTyped(KeyEvent e){ 
        if(ta.getText().length() <=100) 
        	slider.setValue(ta.getText().length()); 
        else ta.setText(ta.getText().substring(0,100)); 
  
        text = ta.getText()+e.getKeyChar();
      } 
    }); 

    setSize(330, 300); 
    setVisible(true);
  } 

  public static void main(String[] args) {
    new Main(); 
  }
} 