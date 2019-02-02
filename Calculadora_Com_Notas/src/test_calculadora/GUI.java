package test_calculadora;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class GUI {
private JFrame frame;
private JTextField tfAluno;
private JTextField tfN1;
private JTextField tfN2;
private JTextField tfTP;
private JTextField tfMedia;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GUI window = new GUI();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the application.
*/
public GUI() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setResizable(false);
frame.setSize(new Dimension(500, 300));
frame.setBounds(100, 100, 550, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JLabel lblAlunoVazio = new JLabel("*Preenchimento obrigat\u00F3rio");
lblAlunoVazio.setVisible(false);
lblAlunoVazio.setForeground(Color.RED);
lblAlunoVazio.setBounds(288, 48, 188, 14);
frame.getContentPane().add(lblAlunoVazio);
JLabel lblN1Vazio = new JLabel("*Preenchimento obrigat\u00F3rio");
lblN1Vazio.setForeground(Color.RED);
lblN1Vazio.setVisible(false);
lblN1Vazio.setBounds(208, 73, 188, 14);
frame.getContentPane().add(lblN1Vazio);
JLabel lblN2Vazio = new JLabel("*Preenchimento obrigat\u00F3rio");
lblN2Vazio.setForeground(Color.RED);
lblN2Vazio.setVisible(false);
lblN2Vazio.setBounds(208, 98, 188, 14);
frame.getContentPane().add(lblN2Vazio);
JLabel lblTPVazio = new JLabel("*Preenchimento obrigat\u00F3rio");
lblTPVazio.setForeground(Color.RED);
lblTPVazio.setVisible(false);
lblTPVazio.setBounds(208, 123, 188, 14);
frame.getContentPane().add(lblTPVazio);
JLabel lblAluno = new JLabel("Aluno:");
lblAluno.setBounds(20, 48, 46, 14);
frame.getContentPane().add(lblAluno);
JLabel lblNota1 = new JLabel("Nota 1:");
lblNota1.setBounds(20, 73, 46, 14);
frame.getContentPane().add(lblNota1);
JLabel lblNota2 = new JLabel("Nota 2:");
lblNota2.setBounds(20, 98, 46, 14);
frame.getContentPane().add(lblNota2);
JLabel lblTrabalho = new JLabel("Trabalho:");
lblTrabalho.setBounds(20, 123, 64, 14);
frame.getContentPane().add(lblTrabalho);
JLabel lblMediaGeral = new JLabel("Media Geral:");
lblMediaGeral.setBounds(20, 148, 82, 14);
frame.getContentPane().add(lblMediaGeral);
JLabel lblCharInvalido = new JLabel("*Tipo de caract\u00E9re digitado \u00E9inv\u00E1lido.");
lblCharInvalido.setForeground(Color.RED);
lblCharInvalido.setVisible(false);
lblCharInvalido.setBounds(20, 190, 258, 14);
frame.getContentPane().add(lblCharInvalido);
tfAluno = new JTextField();
tfAluno.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char c = evt.getKeyChar();
//Aqui verificamos se o que foi digitado � um n�mero. Se for,
//consumimos o evento, ou seja,
//o jTextField n�o receber� o valor digitado
if((Character.isDigit(c))){
evt.consume();
lblCharInvalido.setVisible(true);
}
else {
lblCharInvalido.setVisible(false);
/*if (tfAluno.getText().matches("\\d{0,30}")){
lblCharInvalido.setVisible(true);
}
else {
lblCharInvalido.setVisible(false);*/
}
}
});
tfAluno.addFocusListener(new FocusAdapter() {
@Override
public void focusLost(FocusEvent arg0) {
if (tfAluno.getText().isEmpty() == true) {
lblAlunoVazio.setVisible(true);
}
else {
lblAlunoVazio.setVisible(false);
}
}
});
tfAluno.setBounds(112, 45, 166, 20);
frame.getContentPane().add(tfAluno);
tfAluno.setColumns(10);
tfN1 = new JTextField();
tfN1.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char c = evt.getKeyChar();
//Aqui verificamos se o que foi digitado � um n�mero. Se for,
//consumimos o evento, ou seja,
//o jTextField n�o receber� o valor digitado
if ((Character.isLetter(c))){
evt.consume();
lblCharInvalido.setVisible(true);
}
else if (tfN1.getText().length() > 3) {
evt.consume();
lblCharInvalido.setVisible(true);
}
else if ((Float.parseFloat(tfN1.getText())) > 10 ) {
evt.consume();
lblCharInvalido.setVisible(true);
}
else{
lblCharInvalido.setVisible(false);
/*@Override
public void keyTyped(KeyEvent arg0) {
if (tfN1.getText().matches("\\d{0,30}")){
lblCharInvalido.setVisible(false);
}
else {
lblCharInvalido.setVisible(true);*/
}
}
});
tfN1.addFocusListener(new FocusAdapter() {
@Override
public void focusLost(FocusEvent arg0) {
if (tfN1.getText().isEmpty() == true) {
lblN1Vazio.setVisible(true);
}
else {
lblN1Vazio.setVisible(false);
}
}
});
tfN1.setBounds(112, 70, 86, 20);
frame.getContentPane().add(tfN1);
tfN1.setColumns(10);

tfN2 = new JTextField();
tfN2.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char c = evt.getKeyChar();
//Aqui verificamos se o que foi digitado � um n�mero. Se for,
//consumimos o evento, ou seja,
//o jTextField n�o receber� o valor digitado

float l = 0;
l = Float.valueOf(tfN2.getText());
if(tfN2.getText().isEmpty() == false && Float.valueOf(tfN2.getText()) < 10){
evt.consume();
lblCharInvalido.setVisible(true);
}
else if (tfN2.getText().length() > 1) {
evt.consume();
lblCharInvalido.setVisible(true);
}
else if ((Character.isLetter(c))) {
evt.consume();
lblCharInvalido.setVisible(true);
}
else {
lblCharInvalido.setVisible(false);
}
}
});
tfN2.addFocusListener(new FocusAdapter() {
@Override
public void focusLost(FocusEvent arg0) {
if (tfN2.getText().isEmpty() == true) {
lblN2Vazio.setVisible(true);
}
else {
lblN2Vazio.setVisible(false);
}
}
});
tfN2.setBounds(112, 95, 86, 20);
frame.getContentPane().add(tfN2);
tfN2.setColumns(10);

tfTP = new JTextField();
tfTP.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char c = evt.getKeyChar();
//Aqui verificamos se o que foi digitado � um n�mero. Se for,
//consumimos o evento, ou seja,
//o jTextField n�o receber� o valor digitado
if((Character.isLetter(c))){
evt.consume();
lblCharInvalido.setVisible(true);
}
else if (tfTP.getText().length() > 3) {
evt.consume();
lblCharInvalido.setVisible(true);
}
else {
lblCharInvalido.setVisible(false);
/*@Override
public void keyTyped(KeyEvent arg0) {
if (tfTP.getText().matches("\\d{0,30}")){
lblCharInvalido.setVisible(false);
}
else {
lblCharInvalido.setVisible(true);*/
}
}
});
tfTP.addFocusListener(new FocusAdapter() {
@Override
public void focusLost(FocusEvent arg0) {
if (tfTP.getText().isEmpty() == true) {
lblTPVazio.setVisible(true);
}
else {
lblTPVazio.setVisible(false);
}
}
});
tfTP.setBounds(112, 120, 86, 20);
frame.getContentPane().add(tfTP);
tfTP.setColumns(10);
tfMedia = new JTextField();
tfMedia.setEditable(false);
tfMedia.setBounds(112, 145, 86, 20);
frame.getContentPane().add(tfMedia);
tfMedia.setColumns(10);
JButton btnLimpar = new JButton("Limpar");
btnLimpar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
tfAluno.setText("");
tfN1.setText("");
tfN2.setText("");
tfTP.setText("");
tfMedia.setText("");
lblAlunoVazio.setVisible(false);
lblN1Vazio.setVisible(false);
lblN2Vazio.setVisible(false);
lblTPVazio.setVisible(false);
lblCharInvalido.setVisible(false);
}
});
btnLimpar.setBounds(29, 238, 89, 23);
frame.getContentPane().add(btnLimpar);
JButton btnCalcular = new JButton("Calcular");
btnCalcular.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
if (tfTP.getText().isEmpty() == true) {
lblTPVazio.setVisible(true);
}
else {
Codigo m = new Codigo();
m.setNota1(Float.parseFloat(tfN1.getText()));
m.setNota2(Float.parseFloat(tfN2.getText()));
m.setLista(Float.parseFloat(tfTP.getText()));
tfMedia.setText(String.valueOf(m.calcular()));
}
}
});
btnCalcular.setBounds(220, 238, 89, 23);
frame.getContentPane().add(btnCalcular);
JButton btnSair = new JButton("Sair");
btnSair.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
System.exit(0);
}
});
btnSair.setBounds(422, 238, 89, 23);
frame.getContentPane().add(btnSair);
}
}