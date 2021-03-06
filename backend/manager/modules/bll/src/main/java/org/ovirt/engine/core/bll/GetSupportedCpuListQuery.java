package org.ovirt.engine.core.bll;

import javax.inject.Inject;

import org.ovirt.engine.core.bll.context.EngineContext;
import org.ovirt.engine.core.common.queries.GetSupportedCpuListParameters;

public class GetSupportedCpuListQuery<P extends GetSupportedCpuListParameters> extends QueriesCommandBase<P> {
    public GetSupportedCpuListQuery(P parameters, EngineContext engineContext) {
        super(parameters, engineContext);
    }

    @Inject
    protected CpuFlagsManagerHandler cpuFlagsManagerHandler;

    @Override
    protected void executeQueryCommand() {
        getQueryReturnValue().setReturnValue(cpuFlagsManagerHandler.getSupportedServerCpuList(cpuFlagsManagerHandler.getLatestDictionaryVersion(),
                getParameters().getMaxCpuName()));
    }
}
