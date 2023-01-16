FROM  quay.io/keycloak/keycloak:20.0.3 AS builder

ENV KC_DB=postgres
ENV KC_DB_URL=jdbc:postgresql://postgres_blog:5432/keycloak
ENV KC_DB_USERNAME=keycloak
ENV KC_DB_PASSWORD=kc

WORKDIR /opt/keycloak
RUN /opt/keycloak/bin/kc.sh build

FROM  quay.io/keycloak/keycloak:20.0.3
COPY --from=builder /opt/keycloak/ /opt/keycloak/

ENTRYPOINT ["/opt/keycloak/bin/kc.sh"]