/**
 * COPYRIGHT NOTICE: 
 *
 * This file is part of CitySDK WP5 Tourism Java Library.
 *
 * CitySDK WP5 Tourism Java Library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CitySDK WP5 Tourism Java Library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with CitySDK WP5 Tourism Java Library. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2013, IST
 */
package citysdk.tourism.client.exceptions;

/**
 * Exception thrown when the {@link citysdk.tourism.client.requests.Parameter} is not an available request 
 * for the server.
 * 
 * @author Pedro Cruz
 */
public class ResourceNotAllowedException extends Exception {
	private static final long serialVersionUID = -906645993288106011L;

	public ResourceNotAllowedException() {
		super();
	}

	public ResourceNotAllowedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ResourceNotAllowedException(String arg0) {
		super(arg0);
	}

	public ResourceNotAllowedException(Throwable arg0) {
		super(arg0);
	}
}
