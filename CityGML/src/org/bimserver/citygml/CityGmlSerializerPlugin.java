package org.bimserver.citygml;

/******************************************************************************
 * Copyright (C) 2009-2016  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginContext;
import org.bimserver.plugins.renderengine.RenderEngineException;
import org.bimserver.plugins.serializers.AbstractSerializerPlugin;
import org.bimserver.plugins.serializers.Serializer;
import org.bimserver.shared.exceptions.PluginException;

public class CityGmlSerializerPlugin extends AbstractSerializerPlugin {

	@Override
	public void init(PluginContext pluginContext) throws PluginException, RenderEngineException {
	}
	
	public Serializer createSerializer(PluginConfiguration pluginConfiguration) {
		return new CityGmlSerializer();
	}

	@Override
	public String getDefaultContentType() {
		return "application/gml";
	}

	@Override
	public String getDefaultExtension() {
		return "gml";
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return super.getSettingsDefinition();
	}
	
	@Override
	public boolean needsGeometry() {
		return true;
	}
	
	@Override
	public Set<Schema> getSupportedSchemas() {
		return Schema.IFC2X3TC1.toSet();
	}
}