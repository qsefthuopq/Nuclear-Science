package nuclearscience.common.block;

import electrodynamics.common.block.BlockGenericMachine;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import nuclearscience.common.tile.TileTurbine;

public class BlockTurbine extends BlockGenericMachine {
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new TileTurbine();
	}

}
