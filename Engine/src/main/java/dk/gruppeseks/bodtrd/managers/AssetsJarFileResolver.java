/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.gruppeseks.bodtrd.managers;

import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.files.FileHandle;

/**
 *
 * @author @author Jan Corfixen (Project supervisor)
 */
public class AssetsJarFileResolver implements FileHandleResolver
{
    @Override
    public FileHandle resolve(String fileName)
    {

        return new JarFileHandleStream(fileName);
    }
}
