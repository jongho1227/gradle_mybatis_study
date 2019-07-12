package kr.or.yi.gradle_mybatis_c3p0.ui.content;

import javax.swing.JPanel;

import kr.or.yi.gradle_mybatis_c3p0.dto.Employee;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class PanelEmployee extends AbstractPanel<Employee> {
	private JTextField tfEno;
	private JTextField tfEname;
	private JTextField tfDate;
	private JComboBox cbTitle;
	private JComboBox cbDno;
	private JSpinner spSalary;
	private JPanel pRadio;
	private JRadioButton man;
	private JRadioButton woman;

	
	public PanelEmployee(String title) {
		   super(title);
	}
	@Override
	protected void initComponents(String title) {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblEno = new JLabel("사원번호");
		lblEno.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblEno);
		
		tfEno = new JTextField();
		add(tfEno);
		tfEno.setColumns(10);
		
		JLabel lblEname = new JLabel("사원명");
		lblEname.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblEname);
		
		tfEname = new JTextField();
		add(tfEname);
		tfEname.setColumns(10);
		
		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitle);
		
		cbTitle = new JComboBox();
		add(cbTitle);
		
		JLabel lblDno = new JLabel("부서");
		lblDno.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDno);
		
		cbDno = new JComboBox();
		add(cbDno);
		
		JLabel lalSalary = new JLabel("봉급");
		lalSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lalSalary);
		
		spSalary = new JSpinner();
		add(spSalary);
		
		JLabel lblGender = new JLabel("성별");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblGender);
		
		pRadio = new JPanel();
		add(pRadio);
		pRadio.setLayout(new GridLayout(0, 2, 0, 0));
		
		man = new JRadioButton("남자");
		man.setHorizontalAlignment(SwingConstants.RIGHT);
		pRadio.add(man);
		
		woman = new JRadioButton("여자");
		pRadio.add(woman);
		
		JLabel lblDate = new JLabel("입사날짜");
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDate);
		
		tfDate = new JTextField();
		add(tfDate);
		tfDate.setColumns(10);
	}

	@Override
	public void setItem(Employee item) {
		
		
	}

	@Override
	public Employee getItem() {
		
		return null;
	}

	@Override
	public void clearComponent(int nextNo) {
		
		
	}

}
