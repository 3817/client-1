package me.zeroeightsix.kami.module.modules.misc;

import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.Settings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.util.math.BlockPos;
import scala.Int;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static me.zeroeightsix.kami.util.MessageSendHelper.sendChatMessage;

@Module.Info(name = "Donkey find", category = Module.Category.MISC, description = "Finds you a donkey ar llama")
public class EntityFInd extends Module {

    private List<String> knownPlayers;
    boolean test = false;

    @Override
    public void onUpdate() {
        if (mc.player == null) return;

        List<Integer> tickPlayerList = new ArrayList<>();

        for (Entity entity : mc.world.getLoadedEntityList()) {
            if (entity instanceof EntityDonkey) {
                sendChatMessage("I found a donkey at: " + Math.round(entity.lastTickPosX) + " " + Math.round(entity.lastTickPosY) + " " + Math.round(entity.lastTickPosZ));
            }


            if (tickPlayerList.size() > 0) {


            }
        }
    }


            @Override
            public void onEnable () {
                this.knownPlayers = new ArrayList<>();

            }

        }
