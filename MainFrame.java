package lab3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JPanel drawPanel;
	private JButton btnCircle;
	private JButton btnSquare;
	private JButton btnTriangle;
	private JButton btnFill;
	private JButton btnErase;
	private JLabel lbPosition;
	private JLabel lblArea;
	private JLabel lblLength;
	private JLabel lblPerimeter;
	
	// Creating my objects Shape
	private Circle circle1 = new Circle(100, Color.BLACK);
	private Square square1 = new Square(100, Color.BLACK);
	private Triangle triangle1 = new Triangle(100, Color.BLACK);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Shape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 570);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// COLOR CHANGE
		// Right click Menu
		JPopupMenu popup = new JPopupMenu();
		JMenu header = new JMenu("COLORS");
		popup.add(header);
		// RED
		JMenuItem itemRed = new JMenuItem("Red");
		itemRed.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        circle1.setColor(Color.RED);
		        square1.setColor(Color.RED);
		        triangle1.setColor(Color.RED);
		        
		    }
		});
		popup.add(itemRed);
		
		// BLUE
		JMenuItem itemBlue = new JMenuItem("Blue");
		itemBlue.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        circle1.setColor(Color.BLUE);
		        square1.setColor(Color.BLUE);
		        triangle1.setColor(Color.BLUE);
		        
		    }
		});
		popup.add(itemBlue);
		
		// GREEN
		JMenuItem itemGreen = new JMenuItem("Green");
		itemGreen.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        circle1.setColor(Color.GREEN);
		        square1.setColor(Color.GREEN);
		        triangle1.setColor(Color.GREEN);
		        
		    }
		});
		popup.add(itemGreen);
		
		// YELLOW
		JMenuItem itemYellow = new JMenuItem("Yellow");
		itemYellow.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        circle1.setColor(Color.YELLOW);
		        square1.setColor(Color.YELLOW);
		        triangle1.setColor(Color.YELLOW);
		        
		    }
		});
		popup.add(itemYellow);
		
		// DARK GRAY
		JMenuItem itemDarkGray = new JMenuItem("Dark Gray");
		itemDarkGray.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        circle1.setColor(Color.DARK_GRAY);
		        square1.setColor(Color.DARK_GRAY);
		        triangle1.setColor(Color.DARK_GRAY);
		        
		    }
		});
		popup.add(itemYellow);
		
		// DARK GRAY
		JMenuItem itemBlack = new JMenuItem("Black");
		itemBlack.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        circle1.setColor(Color.BLACK);
		        square1.setColor(Color.BLACK);
		        triangle1.setColor(Color.BLACK);
		        
		    }
		});
		popup.add(itemBlack);
		
		JPanel panelNameOfShape = new JPanel();
		panelNameOfShape.setBackground(Color.DARK_GRAY);
		panelNameOfShape.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelNameOfShape.setBounds(21, 11, 535, 44);
		contentPane.add(panelNameOfShape);
		panelNameOfShape.setLayout(null);

		JLabel lbNameOfShape = new JLabel("NAME OF SHAPE");
		lbNameOfShape.setForeground(new Color(255, 255, 255));
		lbNameOfShape.setHorizontalAlignment(SwingConstants.CENTER);
		lbNameOfShape.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbNameOfShape.setBounds(95, 11, 367, 22);
		panelNameOfShape.add(lbNameOfShape);

		btnCircle = new JButton("CIRCLE");
		btnCircle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbNameOfShape.setText("CIRCLE");
				lblArea.setText("Area: " + circle1.getArea());
				lblPerimeter.setText("Perimeter: " + circle1.getPerimeter());
				lblLength.setText("Length: " + circle1.getSide());

			}
		});

		btnCircle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCircle.setBounds(21, 486, 99, 34);
		contentPane.add(btnCircle);

		btnSquare = new JButton("SQUARE");
		btnSquare.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbNameOfShape.setText("SQUARE");
				lblArea.setText("Area: " + square1.getArea());
				lblPerimeter.setText("Perimeter: " + square1.getPerimeter());
				lblLength.setText("Length: " + square1.getSide());
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSquare.setBounds(130, 486, 99, 34);
		contentPane.add(btnSquare);

		btnTriangle = new JButton("TRIANGLE");
		btnTriangle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbNameOfShape.setText("TRIANGLE");
				lblArea.setText("Area: " + triangle1.getArea());
				lblPerimeter.setText("Perimeter: " + triangle1.getPerimeter());
				lblLength.setText("Length: " + triangle1.getSide());
	
			}
		});
		btnTriangle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTriangle.setBounds(239, 486, 99, 34);
		contentPane.add(btnTriangle);

		btnFill = new JButton("FILL");
		btnFill.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(btnFill.getText().equals("FILL")) {
					btnFill.setText("EMPTY");
				} else {
					btnFill.setText("FILL");
				}
				
			}
		});
		btnFill.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFill.setBounds(348, 486, 99, 34);
		contentPane.add(btnFill);

		btnErase = new JButton("ERASE");
		btnErase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				drawPanel.repaint();
				drawPanel.revalidate();
				
			}
		});
		btnErase.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnErase.setBounds(457, 486, 99, 34);
		contentPane.add(btnErase);

		JPanel panelDescription = new JPanel();
		panelDescription.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelDescription.setBounds(21, 326, 535, 142);
		contentPane.add(panelDescription);
		panelDescription.setLayout(null);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescription.setBounds(200, 11, 158, 24);
		panelDescription.add(lblDescription);

		lbPosition = new JLabel("Position (x,y)");
		lbPosition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbPosition.setHorizontalAlignment(SwingConstants.CENTER);
		lbPosition.setBounds(64, 46, 214, 24);
		panelDescription.add(lbPosition);

		lblArea = new JLabel("Area");
		lblArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArea.setBounds(74, 84, 204, 24);
		panelDescription.add(lblArea);

		lblLength = new JLabel("Length");
		lblLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblLength.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLength.setBounds(288, 46, 185, 24);
		panelDescription.add(lblLength);

		lblPerimeter = new JLabel("Perimeter");
		lblPerimeter.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerimeter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPerimeter.setBounds(288, 84, 185, 24);
		panelDescription.add(lblPerimeter);

		drawPanel = new JPanel();
		drawPanel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawPanel.removeAll();
				
				Point point = e.getPoint();
				int x = (int) point.getX();
				int y = (int) point.getY();
				lbPosition.setText("Position (x,y): " + x + "," + y);	
		
				// CIRCLE
				if (lbNameOfShape.getText().equals("CIRCLE")) {
					Graphics g = drawPanel.getGraphics();
					g.setColor(circle1.getColor());
					if(btnFill.getText().equals("FILL")) {						
						g.fillOval(x - (int)circle1.getSide() / 2, y - (int)circle1.getSide() / 2, (int)circle1.getSide(), (int)circle1.getSide());
					}else {			
						g.drawOval(x - (int)circle1.getSide() / 2, y - (int)circle1.getSide() / 2, (int)circle1.getSide(), (int)circle1.getSide());
					}
					
				// SQUARE
				} else if (lbNameOfShape.getText().equals("SQUARE")) {
					Graphics g = drawPanel.getGraphics();
					g.setColor(square1.getColor());
					if(btnFill.getText().equals("FILL")) {
						g.fillRect(x, y, (int)square1.getSide(), (int)square1.getSide());
					} else {
						g.drawRect(x, y, (int)square1.getSide(), (int)square1.getSide());
					}
				
				// TRIANGLE
				}else if (lbNameOfShape.getText().equals("TRIANGLE")) {
					int side = (int) triangle1.getSide();
					int[] xCoords = {x, x + side / 2, x - side / 2};
					int[] yCoords = {y, y + side, y + side};
					Graphics g = drawPanel.getGraphics();
					g.setColor(triangle1.getColor());
					if(btnFill.getText().equals("FILL")) {
						g.fillPolygon(xCoords, yCoords, 3);	
					} else {
						g.drawPolygon(xCoords, yCoords, 3);
					}
				}
				
			
			}
			
			@Override
			public void mousePressed(MouseEvent e) { 
				if (e.isPopupTrigger()) {
		            popup.show(e.getComponent(), e.getX(), e.getY());
		        }
			}
			
			@Override
			public void mouseReleased(MouseEvent e) { 
			     if (e.isPopupTrigger()) {
			            popup.show(e.getComponent(), e.getX(), e.getY());
			        }
			}
			
			@Override
			public void mouseEntered(MouseEvent e) { }
			
			@Override
			public void mouseExited(MouseEvent e) { }
		});
		
		
		drawPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		drawPanel.setBounds(20, 66, 536, 253);
		contentPane.add(drawPanel);
	}
}
