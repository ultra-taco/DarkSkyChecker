package alex.com.darkskyapp.components.forecast.dagger;

import alex.com.darkskyapp.components.app.api.APIClient;
import alex.com.darkskyapp.components.app.data.DataManager;
import alex.com.darkskyapp.components.app.data.GPSLocationManager;
import alex.com.darkskyapp.components.forecast.core.ForecastModel;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Alex on 11/11/2017.
 */

@Module
public class ForecastServiceModule {

    @Provides
    @ForecastServiceScope
    ForecastModel provideModel(APIClient apiClient, GPSLocationManager GPSLocationManager, DataManager dataManager) {
        return new ForecastModel(apiClient, GPSLocationManager, dataManager);
    }

}
