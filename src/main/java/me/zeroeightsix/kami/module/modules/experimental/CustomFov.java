//love2004#7902
package me.zeroeightsix.kami.module.modules.experimental;

import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.Settings;

@Module.Info(name = "CustomFov",category = Module.Category.EXPERIMENTAL,description = "Allows you to set a custom FOV more/less than designed.")
public class CustomFov extends Module{

        private Setting<Integer> fov = register(Settings.integerBuilder("Fov").withMinimum(30).withValue(120).withMaximum(360));

        @Override
        public void onUpdate(){
                mc.gameSettings.fovSetting = fov.getValue();
        }
}