package me.zeroeightsix.kami.module.modules.experimental;

import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.Settings;
import net.minecraft.init.Items;

@Module.Info(
   name = "Spammer",
   description = "Be an annoying motherfucker",
   category = Module.Category.EXPERIMENTAL
)
public class Spammer extends Module {
   private Setting delays;
   private int delay = 0;
   private Setting DelayChange = this.register(Settings.integerBuilder("SecondDelay").withRange(1, 100).withValue((int)10).build());
   private Setting testchange = this.register(Settings.stringBuilder("Test").withValue("aple").build());

   public void onUpdate() {
      ++this.delay;
      if (this.delay > (Integer)this.DelayChange.getValue() * 40) {
         if (mc.player.sleeping) {
            mc.player.sendChatMessage("I'm sleeping, thanks to ObamaHack!");
         }

         if (mc.player.inWater) {
            mc.player.sendChatMessage("I'm swimming, thanks To ObamaHack!");
         }

         if (mc.player.isDead) {
            mc.player.sendChatMessage("I died, thanks to ObamaHack!");
         }

         if (mc.player.isInWeb) {
            mc.player.sendChatMessage("I'm in a web, thanks to ObamaHack!");
         }

         if (mc.player.inPortal) {
            mc.player.sendChatMessage("I'm going through a portal, thanks to ObamaHack!");
         }

         if (mc.player.isSneaking()) {
            mc.player.sendChatMessage("I'm sneaking, thanks to ObamaHack!");
         }

         if (mc.player.isElytraFlying()) {
            mc.player.sendChatMessage("I'm flying, thanks to ObamaHack!");
         }

         if (mc.fpsCounter == 69) {
            mc.player.sendChatMessage("I'm at 69 FPS, thanks to ObamaHack!");
         }

         if (mc.player.glowing) {
            mc.player.sendChatMessage("I'm glowing, thanks to ObamaHack!");
         }

         if (mc.player.isInLava()) {
            mc.player.sendChatMessage("I'm swimming, thanks to ObamaHack!");
         }

         if (mc.player.isSwingInProgress && mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) {
            mc.player.sendChatMessage("I'm crystalling you, thanks to ObamaHack!");
         }

         if (mc.world.isRaining()) {
            mc.player.sendChatMessage("It's raining, thanks to ObamaHack!");
         }

         if (mc.playerController.isHittingBlock && mc.player.getHeldItemMainhand().getItem() == Items.DIAMOND_PICKAXE) {
            mc.player.sendChatMessage("I'm mining, thansk to ObamaHack!");
         }

         if (mc.player.isSwingInProgress && mc.player.getHeldItemMainhand().getItem() == Items.DIAMOND_SWORD) {
            mc.player.sendChatMessage("I'm swording you, thanks to ObamaHack!");
         }

         if (mc.player.getHealth() == 10.0F && mc.player.getHeldItemMainhand().getItem() == Items.GOLDEN_APPLE) {
            mc.player.sendChatMessage("I'm chugging gapples, thanks to ObamaHack!");
         }

         if (mc.player.getLastAttackedEntityTime() == 1) {
            mc.player.sendChatMessage("I'm at full health, thanks to ObamaHack!");
         }

         if (mc.player.getHeldItemMainhand().getItem() == Items.EXPERIENCE_BOTTLE) {
            mc.player.sendChatMessage("I'm throwing XP, thanks to ObamaHack!");
         }

         this.delay = 0;
      }

   }
}
