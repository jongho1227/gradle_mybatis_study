package kr.or.yi.gradle_mybatis_c3p0.ui.content;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class PanelAbstract<T> extends JPanel {
	

	public PanelAbstract(String title) {
		initComponents(title);
	}

	protected abstract void initComponents(String title);
		

	public abstract void setItem(T item); 

	public abstract T getItem(); 

	public abstract void clearComponent(int nextNo); 

}
