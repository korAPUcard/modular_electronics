package net.apucsw.modelec.api;

import net.neoforged.neoforge.common.ItemAbility;

public final class ModularElectronicsAbilities {
    public static final ItemAbility DEVICE_DEFAULT = ItemAbility.get("device_default");// GUI interaction mode
    public static final ItemAbility DEVICE_CONNECT = ItemAbility.get("device_connect");// Device connect mode
    public static final ItemAbility DEVICE_SCAN = ItemAbility.get("device_scan");// Scanner mode(Blocks, entities, or just QR code, etc.)
}
