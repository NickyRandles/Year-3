import java.awt.*;
import java.awt.event.*;
import java.util.*;

//swing classes
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.tree.*;


public class empTree extends JxFrame
implements TreeSelectionListener {
	Project projects;
    Project SAP, website, payroll;
    Project SAP_requirements, SAP_analysis, SAP_coding, web_design, web_coding, web_analysis, pay_design, pay_coding, pay_testing; 
    JScrollPane sp;
    JPanel treePanel;
    JTree tree;
    DefaultMutableTreeNode troot;
    JLabel cost;

    public empTree() {
        super("Project tree");
        makeEmployees();
        setGUI();
    }
    //--------------------------------------
    private void setGUI() {
        treePanel = new JPanel();
        getContentPane().add(treePanel);
        treePanel.setLayout(new BorderLayout());

        sp = new JScrollPane();
        treePanel.add("Center", sp);
        treePanel.add("South", cost = new JLabel("          "));

        treePanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        troot = new DefaultMutableTreeNode(projects.getName());
        tree= new JTree(troot);
        tree.setBackground(Color.lightGray);
        loadTree(projects);
        /* Put the Tree in a scroller. */

        sp.getViewport().add(tree);
        setSize(new Dimension(300, 300));
        setVisible(true);

    }
    //------------------------------------
    public void loadTree(Project topDog) {
        DefaultMutableTreeNode troot;
        troot = new DefaultMutableTreeNode(topDog.getName());
        treePanel.remove(tree);
        tree= new JTree(troot);
        tree.addTreeSelectionListener(this);
        sp.getViewport().add(tree);

        addNodes(troot, topDog);
        tree.expandRow(0);
        repaint();
    }
    //--------------------------------------

    private void addNodes(DefaultMutableTreeNode pnode, Project emp) {
        DefaultMutableTreeNode node;

        Enumeration e = emp.subordinates();
        if (e != null) {
            while (e.hasMoreElements()) {
            	Project newEmp = (Project)e.nextElement();
                node = new DefaultMutableTreeNode(newEmp.getName());
                pnode.add(node);
                addNodes(node, newEmp);
            }
        }
    }

    //--------------------------------------

    private void makeEmployees() {
        projects = new Task("Projects", 20000);
		projects.add(SAP = new Task("SAP", 3000));
        projects.add(website = new Task("Website", 7000));
        projects.add(payroll = new Task("Payroll", 10000));
        
        SAP.add(SAP_requirements = new Task("Requirements", 500));
        SAP.add(SAP_analysis = new Task("Analysis", 1000));
        SAP.add(SAP_coding = new Task("Coding", 1500));
        
        website.add(web_design = new Task("Design", 1000));
        website.add(web_coding = new Task("Coding", 5000));
        website.add(web_analysis = new Task("Analysis", 1000));
        
        payroll.add(pay_design = new Task("Design", 4000));
        payroll.add(pay_coding = new Task("Coding", 5000));
        payroll.add(pay_testing = new Task("Testing", 1000));        
        
        SAP_analysis.add(new Task("Uml Diagram", 300));
        SAP_analysis.add(new Task("Data Analysis", 500));
        SAP_analysis.add(new Task("Screen Designs", 200));    
        
        web_coding.add(new Task("Program Specs", 3000));
        web_coding.add(new Task("Screens", 2000));   
    }

    //--------------------------------------
    public void valueChanged(TreeSelectionEvent evt) {
        TreePath path = evt.getPath();
        String selectedTerm = path.getLastPathComponent().toString();

        Project emp = projects.getChild(selectedTerm);
        if (emp != null)
            cost.setText(new Float(emp.getSalaries()).toString());
    }
    //--------------------------------------
    static public void main(String argv[]) {
        new empTree();
    }
}

