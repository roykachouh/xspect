package io.xspect.contracts.model;

public class Expectation {

  private final String serviceName;

  private final String serviceVersion;

  private Expectation(Builder builder) {
    serviceName = builder.serviceName;
    serviceVersion = builder.serviceVersion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static Builder newBuilder(Expectation copy) {
    Builder builder = new Builder();
    builder.serviceName = copy.serviceName;
    builder.serviceVersion = copy.serviceVersion;
    return builder;
  }

  public static final class Builder {

    private String serviceName;

    private String serviceVersion;

    private Builder() {
    }

    public Builder withServiceName(String val) {
      serviceName = val;
      return this;
    }

    public Builder withServiceVersion(String val) {
      serviceVersion = val;
      return this;
    }

    public Expectation build() {
      return new Expectation(this);
    }
  }
}
