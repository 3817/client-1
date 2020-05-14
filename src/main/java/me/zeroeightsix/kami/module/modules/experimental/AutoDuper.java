//ollie#0057
package me.zeroeightsix.kami.module.modules.experimental;

        import me.zeroeightsix.kami.module.Module;

        @Module.Info(name = "AutoDuper", category = Module.Category.EXPERIMENTAL, description = "Automatically duplicates any item! Works on all servers.")
        public class AutoDuper extends Module {

        @Override
        public void onEnable() {
        mc.player.sendChatMessage("I just killed myself, thanks to ObamaHack's AutoDuper module!");
        mc.player.sendChatMessage("/kill");
        this.disable();
        }
        }