package org.model.mockfatal2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.model.mockfatal.IFalconStrategy;
import org.model.mockfatal.PoxFalconHandler;

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
