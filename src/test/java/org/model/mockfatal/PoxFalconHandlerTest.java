package org.model.mockfatal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PoxFalconHandlerTest {

    @InjectMocks
    private PoxFalconHandler poxFalconHandler;

    @Mock
    private IFalconStrategy iFalconStrategy;

    @Test
    void testABC() {
        Mockito.doNothing().when(iFalconStrategy).execute();
        Mockito.doNothing().when(iFalconStrategy).loadRequest(Mockito.anyString());

        poxFalconHandler = new PoxFalconHandler(iFalconStrategy);
        poxFalconHandler.handleRequest("blabla", "bleble");
    }

}
