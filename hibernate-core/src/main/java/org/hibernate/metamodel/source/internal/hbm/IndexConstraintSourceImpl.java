/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.source.internal.hbm;

import org.hibernate.metamodel.source.spi.IndexConstraintSource;

/**
 * @author Brett Meyer
 */
class IndexConstraintSourceImpl extends AbstractConstraintSource implements IndexConstraintSource {

	public IndexConstraintSourceImpl( String name, String tableName ) {
		super( name, tableName );
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append( "IndexConstraintSourceImpl" );
		sb.append( "{name='" ).append( name ).append( '\'' );
		sb.append( ", tableName='" ).append( tableName ).append( '\'' );
		sb.append( ", columnNames=" ).append( columnNames );
		sb.append( ", orderings=" ).append( orderings );
		sb.append( '}' );
		return sb.toString();
	}
	
	@Override
	public boolean isUnique() {
		// TODO: Is it possible to have a unique index in HBM?
		return false;
	}
}


