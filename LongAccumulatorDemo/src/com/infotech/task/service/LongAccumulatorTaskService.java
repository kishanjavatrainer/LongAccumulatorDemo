package com.infotech.task.service;

import java.util.concurrent.Callable;

public interface LongAccumulatorTaskService extends Callable<Long> {

	long increment();
	long finalValue();
}
