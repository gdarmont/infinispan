package org.infinispan.client.hotrod.impl.async;

import org.infinispan.client.hotrod.impl.executors.DefaultExecutorFactory;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Default implementation for {@link org.infinispan.commons.executors.ExecutorFactory} based on an {@link ThreadPoolExecutor}.
 *
 * @author Mircea.Markus@jboss.com
 * @since 4.1
 * @deprecated Use {@link DefaultExecutorFactory} instead
 */
public class DefaultAsyncExecutorFactory extends DefaultExecutorFactory {
}
