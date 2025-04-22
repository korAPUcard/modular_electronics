package net.apucsw.modelec.common.registries;

import mekanism.common.registration.impl.SoundEventDeferredRegister;
import mekanism.common.registration.impl.SoundEventRegistryObject;
import net.apucsw.modelec.common.ModularElectronics;
import net.minecraft.sounds.SoundEvent;

public final class ModularElectronicsSounds {
    private ModularElectronicsSounds() {}

    public static final SoundEventDeferredRegister SOUND_EVENTS = new SoundEventDeferredRegister(ModularElectronics.MODID);
    
    public static final SoundEventRegistryObject<SoundEvent> ELECTRICAL_EXPLOSION = SOUND_EVENTS.register("tile.machine.electrical_explosion");
}
