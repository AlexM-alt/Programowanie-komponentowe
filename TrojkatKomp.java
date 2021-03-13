
/**
 *  Klasa zawierająca główny kod źródłowy odpowiedzialny za działanie aplikacji.
 *  @author Aleksander Micyk
 *  @version 1.0.0 
 */
import java.awt.Color;
import java.util.Random;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TrojkatKomp extends javax.swing.JPanel {

   
    public TrojkatKomp() {
        initComponents();
    }
    
      private int randomValueMin = 1;         // zmienna przechowująca dolną granice losowanych liczb
      private int randomValueMax = 10;        // zmienna przechowująca górną granice losowanych liczb
      private Color trueColor = Color.green ; // zmienna przechowująca kolor dla wariantu pozytywnego
      private Color falseColor = Color.red ;  // zmienna przechowująca kolor dla wariantu negatywnego


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">  
    
    
    private void initComponents() {

        jButtonClean = new javax.swing.JButton();
        jButtonRandom = new javax.swing.JButton();
        jButtonCalculate = new javax.swing.JButton();
        jLabelInfo = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        jButtonClean.setText("wyczyść");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jButtonRandom.setText("losowanie");
        jButtonRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRandomActionPerformed(evt);
            }
        });

        jButtonCalculate.setText("oblicz");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jLabelInfo.setText("Wprowadź 3 długości odcinków lub je wylosuj następnie wcisnij oblicz ");
        jLabelInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelInfo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        
        jTextField1.setDocument( new JTextFieldLimit( 7 ) );
        jTextField2.setDocument( new JTextFieldLimit( 7 ) );
        jTextField3.setDocument( new JTextFieldLimit( 7 ) );
        
        
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText("Aby sprawdzić wciśnij \"oblicz\"");
        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRandom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCalculate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRandom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonClean))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    
    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {                                             
         startOption();
    }  
    
      
    private void jButtonRandomActionPerformed(java.awt.event.ActionEvent evt) {                                              
       randomLogic();
    }                                             

    
    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       checkScore();     
    }                                                                                

    
    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {                                     
        checkjTextField( evt );
    }                                    

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           
    
    
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {                                     
        checkjTextField( evt );
    }                                    

   
    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {                                     
       checkjTextField( evt );
    }                                    
                                        

    
    private void checkjTextField(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }   
       
    
    /**
     * Metoda ustawiająca opcje startowe programu
     */
    private void startOption(){
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("Wprowdz lub losuj wartości");
         jTextField4.setForeground( Color.BLACK );
         jTextField1.setBackground( Color.white );
         jTextField2.setBackground( Color.white );
         jTextField3.setBackground( Color.white );
    }
    
    /**
     * W metodzie zawarta jest logika programu i zasady związane z budowaniem trójkata 
     */
    private void checkScore(){
                int a = 0;
                int b = 0; 
                int c = 0;
                boolean score = false;

        try{
                a = (int) Double.parseDouble( jTextField1.getText());
                b = (int) Double.parseDouble( jTextField2.getText());
                c = (int) Double.parseDouble( jTextField3.getText());
            if((a > b) && (a > c)){
                if(a < (b + c) ) score = true;
                else score = false;

            }
            else if((b > a) & (b > c)){
                if(b < (a + c)) score = true;
                else score = false;
            }

            else{
                if(c < (a + b)) score = true;
                else score = false;
            }

            if(score == true){
                jTextField4.setText("Udało się stworzyć trójkąt");
                jTextField1.setBackground( trueColor );
                jTextField2.setBackground( trueColor );
                jTextField3.setBackground( trueColor );
                jTextField4.setForeground( trueColor );
            }
            else if ( score == false){
                jTextField4.setText("Nie udało się stworzyć trójkąta");
                jTextField1.setBackground( falseColor );
                jTextField2.setBackground( falseColor );
                jTextField3.setBackground( falseColor );
                jTextField4.setForeground( falseColor );
            }
            
            }catch (NumberFormatException e){
            jTextField4.setText("Musisz podać długości odcinków");
            jTextField4.setForeground( Color.ORANGE );
            jTextField1.setBackground( Color.white );
            jTextField2.setBackground( Color.white );
            jTextField3.setBackground( Color.white );
        }
       

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(score);
        
    }
    
   /**
    * Metoda odpowiedzialna za wygenerowanie liczb pseudolosowych z przedziału liczbowego
    */
    private void randomLogic(){
       
        Random random = new Random();
        int i =  random.nextInt( randomValueMax - randomValueMin + 1) + randomValueMin;
        jTextField1.setText( String.valueOf(i) );

        i =  random.nextInt( randomValueMax - randomValueMin + 1) + randomValueMin;
        jTextField2.setText( String.valueOf(i) );

        i =  random.nextInt( randomValueMax - randomValueMin + 1) + randomValueMin;
        jTextField3.setText( String.valueOf(i) );
      
        jTextField1.setBackground( Color.white );
        jTextField2.setBackground( Color.white );
        jTextField3.setBackground( Color.white );
        jTextField4.setForeground( Color.BLACK );
        jTextField4.setText("Wcisnij oblicz");
    }
    
    /**
     * Metoda geter zwraca wartość dolnej granicy liczb pseudolosowych.
     * @return randomValueMin zwraca wartość dolnej granicy liczb pseudolosowych.
     */
    public int getRandomValueMin() {
        return randomValueMin;
    }

    /**
     * Metoda seter umożliwia wprowadzenie wartości dolnej granicy liczb pseudolosowych.
     * @param randomValueMin dolna granica liczb pseudolosowych
     */
    public void setRandomValueMin(int randomValueMin) {
        this.randomValueMin = randomValueMin;
    }
    
    /**
     * Metoda geter zwraca wartość górną granicy liczb pseudolosowych.
     * @return randomValueMax zwraca wartość górnej granicy liczb pseudolosowych.
     */
    public int getRandomValueMax() {
        return randomValueMax;
    }
    
    /**
      * Metoda seter umożliwia wprowadzenie wartości górnej granicy liczb pseudolosowych.
      * @param randomValueMax górnej granica liczb pseudolosowych.
     */
    public void setRandomValueMax(int randomValueMax) {
        this.randomValueMax = randomValueMax;
    }
    
    /**
     * Metoda geter zwraca color dla pozytywnego rezultatu - udało się stworzyć.
     * @return trueColor zwraca color pozytywnego rezultatu.
     */
    public Color getTrueColor() {
        return trueColor;
    }
    
    /**
     * Metoda seter umożliwia ustawienie odpowiedniego koloru dla pozytywnego rezultatu.
     * @param trueColor color pozytywnego rezultatu.
     */
    public void setTrueColor(Color trueColor) {
        this.trueColor = trueColor;
    }

    /**
     * Metoda geter zwraca color dla negatywnego rezultatu - nie udało się stworzyć.
     * @return falseColor zwraca color negatywnego rezultatu.
     */
    public Color getFalseColor() {
        return falseColor;
    }

    /**
     * Metoda seter umożliwia ustawienie odpowiedniego koloru dla negatywnego rezultatu.
     * @param falseColor color negatywnego rezultatu.
     */
    public void setFalseColor(Color falseColor) {
        this.falseColor = falseColor;
    }
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonRandom;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}

