package earth.terrarium.ad_astra.client.renderer.block.flag;

import com.mojang.blaze3d.vertex.PoseStack;
import earth.terrarium.ad_astra.AdAstra;
import earth.terrarium.ad_astra.client.AdAstraClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;


public class

FlagItemRenderer extends BlockEntityWithoutLevelRenderer {

    public FlagItemRenderer() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        ResourceLocation model = new ResourceLocation(AdAstra.MOD_ID, "block/flag/" + BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath());
        AdAstraClient.renderBlock(model, poseStack, buffer, packedLight, packedOverlay);
    }
}