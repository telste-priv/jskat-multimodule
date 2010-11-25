/*

@ShortLicense@

Authors: @JS@
         @MJL@

Released: @ReleaseDate@

 */

package de.jskat.gui.iss;

import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import de.jskat.gui.action.JSkatAction;

class StartContextPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public StartContextPanel(ActionMap actions) {

		initPanel(actions);
	}

	public void initPanel(ActionMap actions) {

		this.setLayout(new MigLayout("fill", "fill", "fill")); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$

		JPanel panel = new JPanel(new MigLayout("fill")); //$NON-NLS-1$
		panel.add(new JButton(actions.get(JSkatAction.INVITE_ISS_PLAYER)),
				"center"); //$NON-NLS-1$
		panel.add(new JButton(actions.get(JSkatAction.READY_TO_PLAY)), "center"); //$NON-NLS-1$
		panel.add(new JButton(actions.get(JSkatAction.TALK_ENABLED)),
				"center, wrap"); //$NON-NLS-1$
		panel.add(new JButton(actions.get(JSkatAction.CHANGE_TABLE_SEATS)),
				"center"); //$NON-NLS-1$
		panel.add(new JButton(actions.get(JSkatAction.LEAVE_ISS_TABLE)),
				"center"); //$NON-NLS-1$
		panel.setOpaque(false);
		this.add(panel, "center"); //$NON-NLS-1$

		setOpaque(false);
	}
}
