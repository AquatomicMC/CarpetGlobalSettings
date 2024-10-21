package bluesea.carpetglobalsettings.mixin;

import carpet.api.settings.SettingsManager;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = SettingsManager.class, remap = false)
public class SettingsManagerMixin {
    @Redirect(
        method = "readSettingsFromConf",
        at = @At(
            value = "INVOKE",
            target = "Lnet/fabricmc/loader/api/FabricLoader;getEnvironmentType()Lnet/fabricmc/api/EnvType;"
        )
    )
    public EnvType readSettingsFromConf$globalSettings(FabricLoader instance) {
        return EnvType.CLIENT;
    }
}
