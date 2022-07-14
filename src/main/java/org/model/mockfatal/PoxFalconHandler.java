package org.model.mockfatal;

public class PoxFalconHandler {

    private final IFalconStrategy falconStrategy;

    public PoxFalconHandler() {
        this.falconStrategy = FalconStrategyImpl.getInstance();
    }

    // TESTEEE
    PoxFalconHandler(IFalconStrategy falconStrategy) {
        this.falconStrategy = falconStrategy;
    }

    public void handleRequest(String arg1, String arg2) {
        falconStrategy.loadRequest("blabla");
        falconStrategy.execute();
    }

}
