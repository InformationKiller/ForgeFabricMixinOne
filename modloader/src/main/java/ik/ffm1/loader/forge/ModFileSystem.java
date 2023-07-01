package ik.ffm1.loader.forge;

import java.nio.file.spi.FileSystemProvider;

import ik.ffm1.loader.fs.AbstractFileSystem;

class ModFileSystem extends AbstractFileSystem {

    static final ModFileSystem INSTANCE = new ModFileSystem();

    @Override
    public FileSystemProvider provider() {
        return ModFileSystemProvider.INSTANCE;
    }
}
