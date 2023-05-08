package Taller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import Practico.Ejercicio_3.SimpleLexer;
import Practico.Ejercicio_3.SimpleParser;
import Practico.Ejercicio_3.SimpleParser.SentenciaContext;

import java.io.*;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Interfaz {
	public Interfaz(String[] args) throws IOException {
    	
    	
		
    	
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        
        double anchoVentana = tk.getScreenSize().getWidth();
        double altoVentana = tk.getScreenSize().getHeight();
        JFrame ventana = new JFrame("Compilador IncomPy");
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.getContentPane().setBackground(new Color(53, 53, 53));
        ventana.setMinimumSize(new Dimension((int)(anchoVentana*0.6), (int)(altoVentana*0.5)));
        ventana.setIconImage(new ImageIcon("src/main/java/recursos/iconoApp.png").getImage());
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem subMenuAbrir = new JMenuItem("Abrir");
        JMenuItem subMenuGuardar = new JMenuItem("Guardar");
        JFileChooser exploradorArchivos = new JFileChooser();
        FileNameExtensionFilter filtroPython = new FileNameExtensionFilter("Archivos incomPy, Python, txt", "incompy", "py", "txt");
        exploradorArchivos.setFileFilter(filtroPython);

        

        JLabel textoEntrada = new JLabel("Entrada", SwingConstants.CENTER);
        textoEntrada.setBounds(10, 20, 80, 40);
        textoEntrada.setFont(textoEntrada.getFont().deriveFont(14f));
        textoEntrada.setOpaque(true);
        textoEntrada.setBackground(Color.darkGray);

        JLabel textoSalida = new JLabel("Salida", SwingConstants.CENTER);
        textoSalida.setBounds((int) (anchoVentana * 0.5) + 10, 20, 80, 40);
        textoSalida.setFont(textoSalida.getFont().deriveFont(14f));
        textoSalida.setOpaque(true);
        textoSalida.setBackground(Color.darkGray);
        
        Icon iconoClear = new ImageIcon("src/main/java/recursos/icono-clear.png");
        Icon iconoClearOff = new ImageIcon("src/main/java/recursos/icono-clearOff.png");
        Icon iconoPlayOn = new ImageIcon("src/main/java/recursos/icono-play.png");
        Icon iconoPlayOff = new ImageIcon("src/main/java/recursos/icono-playOff.png");
        
        JButton botonClear = new JButton(iconoClearOff);
        botonClear.setBounds((int) (anchoVentana * 0.07), 30, 20, 20);
        botonClear.setContentAreaFilled(false);
        botonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	botonClear.setIcon(iconoClear);
            	botonClear.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	botonClear.setIcon(iconoClearOff);
            }
        });
        
        JButton botonRun = new JButton(iconoPlayOff);
        botonRun.setBounds((int) (anchoVentana * 0.47), 30, 20, 20);
        botonRun.setContentAreaFilled(false);
        botonRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRun.setIcon(iconoPlayOn);
                botonRun.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRun.setIcon(iconoPlayOff);
            }
        });
        

        JTextArea areaCodigo = new JTextArea();
        areaCodigo.setLineWrap(true);
        areaCodigo.setWrapStyleWord(true);
        areaCodigo.setFont(areaCodigo.getFont().deriveFont(14f));
        JScrollPane areaCodigoScroll = new JScrollPane(areaCodigo);
        areaCodigoScroll.setBounds(10, 60, (int) (anchoVentana * 0.5) - 10, (int) (altoVentana * 0.8));
        areaCodigoScroll.setBorder(null);

        JTextArea areaOutput = new JTextArea();
        areaOutput.setEditable(false);
        areaOutput.setLineWrap(true);
        areaOutput.setWrapStyleWord(true);
        areaOutput.setFont(areaOutput.getFont().deriveFont(14f));
        JScrollPane areaOutputScroll = new JScrollPane(areaOutput);
        areaOutputScroll.setBounds((int) (anchoVentana * 0.5) + 10, 60, (int) (anchoVentana * 0.5) - 20,(int) (altoVentana * 0.8));
        areaOutputScroll.setBorder(null);

        subMenuAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    int valorExplorador = exploradorArchivos.showOpenDialog(ventana);
                    File archivo=null;
                    if (valorExplorador == JFileChooser.APPROVE_OPTION){
                        archivo = exploradorArchivos.getSelectedFile();
                        areaCodigo.setText(null);
                    }
                    
                    BufferedReader entradaArchivo = new BufferedReader(new FileReader(archivo));
                    String lineaArchivo = entradaArchivo.readLine();
                    while(lineaArchivo != null){
                        areaCodigo.append(lineaArchivo + "\n");
                        lineaArchivo = entradaArchivo.readLine();
                      }
                   entradaArchivo.close();
                } catch (Exception e2) {
                    System.out.println(e2);
                }
                
            }
        });
        
        subMenuGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    int valorExplorador = exploradorArchivos.showSaveDialog(ventana);
                    if (valorExplorador == JFileChooser.APPROVE_OPTION){
                    	File fileToSave = exploradorArchivos.getSelectedFile();
                    	if (!fileToSave.getName().endsWith(".incompy")) {
                            fileToSave = new File(fileToSave.getAbsolutePath() + ".incompy");
                         }
                    	BufferedWriter outFile = null;
                        try {
                           outFile = new BufferedWriter(new FileWriter(fileToSave));

                           areaCodigo.write(outFile);

                        } catch (IOException ex) {
                           ex.printStackTrace();
                        } finally {
                           if (outFile != null) {
                              try {
                                 outFile.close();
                              } catch (IOException exec) {}
                           }
                        }
                    }
                } catch (Exception e2) {
                    System.out.println(e2);
                }
                
            }
        });
        botonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	areaCodigo.setText("");
            	
            }
        });
        botonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (areaCodigo.getText() != null) {
                	try {
                		
                		File fileName = new File("test/test.smp");
                        try {
                            BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName));
                            outFile.write(areaCodigo.getText()); //put in textfile

                            outFile.close();
                        } catch (IOException ex) {
                        }
                		
                    	String program = "test/test.smp";
                    	
                		SimpleLexer lexer = new SimpleLexer(new ANTLRFileStream(program), areaOutput);
                		
                		lexer.removeErrorListeners();
                		ErroresLexicos erroresLex = new ErroresLexicos();
                		lexer.addErrorListener(erroresLex);
                		
                		CommonTokenStream tokens = new CommonTokenStream(lexer);
                		SimpleParser parser = new SimpleParser(tokens, areaOutput);
                		
                		parser.removeErrorListeners();
                		ErroresSintacticos erroresSin = new ErroresSintacticos();
                		parser.addErrorListener(erroresSin);
                		
                		HashMap<String, Object> Tabla = new HashMap<String, Object>();
                		SimpleParser.StartContext tree = parser.start(Tabla);

                		SimpleCustomVisitor visitor = new SimpleCustomVisitor();
                		
                			visitor.visit(tree);
                			StringBuilder builder = new StringBuilder();
                			
                			for(TokenTxt e1 : erroresLex.getErrores()){
                				builder.append(String.format("- En %s:%s simbolo %s no reconocido",
                						e1.getLinea(), e1.getPosicion(), e1.getSimbolo())).append("\n");                				
                			}
                			
                			for (String e1 : erroresSin.getErrores()) {
                				
                					builder.append("- "+e1).append("\n");
                				
                			}
                			
                			for (String e1 : parser.erroresSem) {
                				builder.append("- "+e1).append("\n");
                			}
                			if(builder.toString().length() >= 0){
                				areaOutput.append(builder.toString());
                			}
                	
                	} catch (Exception e2) {
                		
                	}
                    
                }
                }
                
        });
        
        menuArchivo.add(subMenuAbrir);
        menuArchivo.add(subMenuGuardar);
        barraMenu.add(menuArchivo);
        ventana.add(botonClear);
        ventana.add(botonRun);
        ventana.add(textoEntrada);
        ventana.add(textoSalida);
        ventana.getContentPane().add(areaCodigoScroll);
        ventana.getContentPane().add(areaOutputScroll);
        ventana.setJMenuBar(barraMenu);
        ventana.setLayout(null);
        ventana.pack();
        ventana.setVisible(true);
    }

}
