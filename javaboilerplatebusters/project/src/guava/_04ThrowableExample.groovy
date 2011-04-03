
@Grab(group='com.google.guava', module='guava', version='r08')
@Grab(group='com.google.guava', module='guava', version='r08', classifier='sources')
import com.google.common.base.Throwables


def ex = new Exception();

// Propagates throwable as-is if it is an instance of RuntimeException or Error,
// or else as a last resort, wraps it in a RuntimeException then propagates.
Throwables.propagate(ex)

// Propagates throwable exactly as-is, if and only if it is an instance of RuntimeException or Error.
Throwables.propagateIfPossible(ex)

// Rethrows the cause exception of a given throwable, discarding the original throwable.
// if the cause is null, then throws that
Throwables.throwCause(ex, false)
