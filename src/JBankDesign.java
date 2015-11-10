import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.plaf.FileChooserUI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class JBankDesign extends JPanel{

	private JFrame TestReadExcel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBankDesign window = new JBankDesign();
					window.TestReadExcel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JBankDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TestReadExcel = new JFrame();
		TestReadExcel.setTitle("Read Excel");
		TestReadExcel.setBounds(100, 100, 450, 300);
		TestReadExcel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		TestReadExcel.getContentPane().setLayout(gridBagLayout);
		
		JButton btnNewButton = new JButton("Upload");
		
		JFileChooser fc = new JFileChooser();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int returnVal = fc.showOpenDialog(JBankDesign.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File fileName = fc.getSelectedFile();
	                String str = fileName.toString();	                
	                
					try {
						
						FileInputStream file = new FileInputStream(new File(str));
					
	                //Create Workbook instance holding reference to .xlsx file
						XSSFWorkbook workbook = null;
						try {
							workbook = new XSSFWorkbook(file);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	     
	                //Get first/desired sheet from the workbook
	                XSSFSheet sheet = workbook.getSheetAt(0);
	                
	                
	                //Iterate through each rows one by one
	                Iterator<Row> rowIterator = sheet.iterator();
	                while (rowIterator.hasNext())
	                {
	                    Row row = rowIterator.next();
	                    //For each row, iterate through all the columns
	                    Iterator<Cell> cellIterator = row.cellIterator();
	                     
	                    while (cellIterator.hasNext())
	                    {
	                        Cell cell = cellIterator.next();
	                        //Check the cell type and format accordingly
	                        switch (cell.getCellType())
	                        {
	                            case Cell.CELL_TYPE_NUMERIC:
	                                System.out.print(cell.getNumericCellValue() + " ");
	                                break;
	                            case Cell.CELL_TYPE_STRING:
	                                System.out.print(cell.getStringCellValue() + " ");
	                                break;
	                        }
	                    }
	                    System.out.println("");
	                }
	                	try {
							file.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                
				}	
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		TestReadExcel.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

	
}
