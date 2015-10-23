/**
 * 
 */
package me.finiteloop.microservice.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author klimaye
 *
 */
@ApplicationScoped
@ApplicationPath("/")
public class JaxRsApplication extends Application{

}
