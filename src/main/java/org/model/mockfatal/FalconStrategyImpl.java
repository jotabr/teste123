package org.model.mockfatal;

public class FalconStrategyImpl implements IFalconStrategy {
    private static FalconStrategyImpl INSTANCE;

    private FalconStrategyImpl() {
    }

    public static FalconStrategyImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FalconStrategyImpl();
        }
        return INSTANCE;
    }

    @Override
    public void execute() {
        System.out.println("Execute");
    }

    @Override
    public void loadRequest(String arg) {
        System.out.println("Load Request: [ " + arg + " ]");
    }
}
