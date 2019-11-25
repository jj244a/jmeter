package org.apache.jmeter.protocol.http.gui.action;

import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.Set;

import org.apache.jmeter.exceptions.IllegalUserActionException;
import org.apache.jmeter.gui.action.AbstractActionWithNoRunningTest;
import org.apache.jmeter.gui.action.ActionNames;
import org.apache.jmeter.util.JMeterUtils;

public class CorrelationExportRule extends AbstractActionWithNoRunningTest {

    private static final Set<String> commands = new HashSet<>();

    static {
        commands.add(ActionNames.CORRELATION_EXPORT_RULE);
    }

    public CorrelationExportRule() {
        super();
    }

    @Override
    public Set<String> getActionNames() {
        return commands;
    }

    @Override
    protected void doActionAfterCheck(ActionEvent e) throws IllegalUserActionException {
        JMeterUtils.reportInfoToUser("Export Rule works", "Works");
    }

}
