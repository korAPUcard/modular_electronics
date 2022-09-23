package net.apucsw.apuclib.shared.util;

import net.minecraft.world.damagesource.DamageSource;

public class AdditionalDamageSource extends DamageSource {
    public static final DamageSource ELECTRIC_SHOCK = (new AdditionalDamageSource("electric_shock")).bypassMagic();
    public static final DamageSource ELECTRIC_EXPLOSION = (new AdditionalDamageSource("electric_explosion")).setExplosion().bypassArmor().bypassMagic();
    public static final DamageSource ELECTRONICS_HEAT_DAMAGE = (new AdditionalDamageSource("electronics_heat_damage")).setIsFire().bypassArmor().bypassMagic();
    public static final DamageSource ELECTRONICS_COLD_DAMAGE = (new AdditionalDamageSource("electronics_cold_damage")).setIsFreezing().bypassArmor().bypassMagic();

    private boolean isFreezingSource;

    public DamageSource setIsFreezing() {
        this.isFreezingSource = true;
        return this;
    }

    public boolean isFreezing() {
        return this.isFreezingSource;
    }

    public AdditionalDamageSource(String p_i1566_1b_) {
        super(p_i1566_1b_);
    }
}
