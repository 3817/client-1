package me.zeroeightsix.kami.module.modules.player;

import me.zeroeightsix.kami.module.Module;

/**
 * @author 086
 */
@Module.Info(name = "Fastbreak", category = Module.Category.EXPERIMENTAL, description = "Nullifies block hit delay")
public class Fastbreak extends Module {

    @Override
    public void onUpdate() {
        mc.playerController.blockHitDelay = 0;
    }
}
