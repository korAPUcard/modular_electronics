package net.apucsw.modelec.client.sound;

import mekanism.client.sound.PlayerSound;
import mekanism.common.item.gear.ItemFlamethrower;
import net.apucsw.modelec.common.registries.ModularElectronicsSounds;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

public class DeviceExplosionSound extends PlayerSound {
    public DeviceExplosionSound(@NotNull Player player) {
        super(player, ModularElectronicsSounds.ELECTRICAL_EXPLOSION);
    }

    @Override
    public boolean shouldPlaySound(@NotNull Player player) {
        // TODO: If the items or blocks what it's using the energy power(FE, RF, Joule, etc.) is in case of surge, overvoltage input, ignited, chain explosion, or some reason, must play this.
        return false;
    }

//    @Override
//    public boolean shouldPlaySound(@NotNull Player player) {
//        //If the item being used is a flamethrower, return that we should play the sound
//        return player.isUsingItem() && player.getItemInHand(player.getUsedItemHand()).getItem() instanceof ItemFlamethrower;
//    }
}
