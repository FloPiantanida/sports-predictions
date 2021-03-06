package predictions;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import predictions.configuration.GoogleSigninConfiguration;

import java.util.Set;

public class PredictionsConfiguration extends Configuration {

	private boolean liveWebSite = false;

    @Valid
    @NotNull
    private String eventName = "World Cup 2018";

	@Valid
	@NotNull
	private String publicDomain = "pronostics2016.com";

    @Valid
    @NotNull
	private String defaultCommunity = "grand-est";

	@Valid
	@NotNull
	private String footballDataApiKey;

	@Valid
	@NotNull
	private String swaggerApiHost = "http://locahost:9000";

	@Valid
	@NotNull
	private String googleReCaptchaSecretKey;

	@Valid
	private boolean googleReCaptchaEnabled = true;

	@Valid
	@NotNull
	private String oAuth2CredentialsFolder;

	private Set<String> administratorAccounts;

	public String getGoogleReCaptchaSecretKey() {
		return googleReCaptchaSecretKey;
	}
	
	public boolean isGoogleReCaptchaEnabled() {
		return googleReCaptchaEnabled;
	}
	
	public String getoAuth2CredentialsFolder() {
		return oAuth2CredentialsFolder;
	}

	private GoogleSigninConfiguration googleSignin = new GoogleSigninConfiguration();

	@Valid
	@NotNull
	@JsonProperty
	private DataSourceFactory database = new DataSourceFactory();

	public DataSourceFactory getDataSourceFactory() {
		return database;
	}

    public String getPublicDomain() {
        return publicDomain;
    }

    public void setPublicDomain(String publicDomain) {
        this.publicDomain = publicDomain;
    }

    public String getDefaultCommunity() {
        return defaultCommunity;
    }

    public void setDefaultCommunity(String defaultCommunity) {
        this.defaultCommunity = defaultCommunity;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

	public boolean isLiveWebSite() {
		return liveWebSite;
	}

	public void setLiveWebSite(boolean liveWebSite) {
		this.liveWebSite = liveWebSite;
	}

	public String getFootballDataApiKey() {
		return footballDataApiKey;
	}

	public void setFootballDataApiKey(String footballDataApiKey) {
		this.footballDataApiKey = footballDataApiKey;
	}

	public String getSwaggerApiHost() {
		return swaggerApiHost;
	}

	public void setSwaggerApiHost(String swaggerApiHost) {
		this.swaggerApiHost = swaggerApiHost;
	}

	public void setGoogleReCaptchaSecretKey(String googleReCaptchaSecretKey) {
		this.googleReCaptchaSecretKey = googleReCaptchaSecretKey;
	}

	public void setGoogleReCaptchaEnabled(boolean googleReCaptchaEnabled) {
		this.googleReCaptchaEnabled = googleReCaptchaEnabled;
	}


	public void setoAuth2CredentialsFolder(String oAuth2CredentialsFolder) {
		this.oAuth2CredentialsFolder = oAuth2CredentialsFolder;
	}

	public DataSourceFactory getDatabase() {
		return database;
	}

	public void setDatabase(DataSourceFactory database) {
		this.database = database;
	}

	public GoogleSigninConfiguration getGoogleSignin() {
		return googleSignin;
	}

	public void setGoogleSignin(GoogleSigninConfiguration googleSignin) {
		this.googleSignin = googleSignin;
	}

	public Set<String> getAdministratorAccounts() {
		return administratorAccounts;
	}

	public void setAdministratorAccounts(Set<String> administratorAccounts) {
		this.administratorAccounts = administratorAccounts;
	}
}
