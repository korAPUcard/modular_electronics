package net.apucsw.modelec.main.items;

import net.minecraft.world.item.Item;

public class SmartphoneItem extends Item implements IEnergyContainerItem {
    private static final long MAX_ENERGY = 100_000; // 최대 저장 에너지
    private static final long TRANSFER_RATE = 500; // 충전 속도

    public SmartphoneItem(Properties properties) {
        super(properties);
    }
}
