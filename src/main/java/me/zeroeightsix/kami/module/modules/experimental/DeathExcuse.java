package me.zeroeightsix.kami.module.modules.experimental;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import me.zeroeightsix.kami.module.Module;

@Module.Info(
   name = "DeathExcuse",
   description = "Uhhhhh, you didn't die!",
   category = Module.Category.EXPERIMENTAL
)
public class DeathExcuse extends Module {
   private int delay = 0;

   public void onUpdate() {
      ++this.delay;
      List myList = Arrays.asList("C'mon bro! I'm on impact :(", "My mouse disconnected dude", "Stupid internet always really do be cutting out", "I'm getting DDoSed right now, that's why I died!", "Wow died because of my Ping", "BRB, ima go touch myself to Obama", "The cum on my fingers from my jerkfest earlier caused my fingers to slip off my mouse resulting in me dying");
      Random r = new Random();
      int randomitem = r.nextInt(myList.size());
      String randomElement = (String)myList.get(randomitem);
      if (mc.player.isDead) {
         this.delay = 20000000;
      }

      if (this.delay > 20000100) {
         mc.player.sendChatMessage(randomElement);
         this.delay = 0;
      }

   }
}
