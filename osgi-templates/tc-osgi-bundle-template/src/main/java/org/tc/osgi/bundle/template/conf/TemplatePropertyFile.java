package org.tc.osgi.bundle.template.conf;

import org.tc.osgi.bundle.utils.interf.conf.AbstractPropertyFile;
import org.tc.osgi.bundle.utils.interf.conf.exception.FieldTrackingAssignementException;

/**
 * AptConfiguration.java.
 * @author collonville thomas
 * @version 0.0.1
 */
public final class TemplatePropertyFile extends AbstractPropertyFile {
	/**
	 * String EQUINOXLOADERFILE.
	 */
	public static final String TEMPLATE_FILE = "template";

	/**
	 * String BUNDLE_RACINE.
	 */
	public final static String BUNDLE_RACINE = "tc.osgi.bundle.template.";

	/**
	 * DefaultConfig conf.
	 */
	private static TemplatePropertyFile instance = null;

	/**
	 * getInstance.
	 * @return DefaultConfig
	 * @throws EquinoxConfigException
	 * @throws FieldTrackingAssignementException
	 */
	public static TemplatePropertyFile getInstance() {
		if (TemplatePropertyFile.instance == null) {
			TemplatePropertyFile.instance = new TemplatePropertyFile();
		}
		return TemplatePropertyFile.instance;
	}


	/**
	 * AptConfiguration constructor.
	 */
	private TemplatePropertyFile() {
		super(TemplatePropertyFile.TEMPLATE_FILE, TemplatePropertyFile.class.getClassLoader());
	}

	

	/**
	 * @return String
	 * @see org.tc.osgi.bundle.utils.conf.AbstractPropertyFile#getBundleRacine()
	 */
	@Override
	public String getBundleRacine() {
		return TemplatePropertyFile.BUNDLE_RACINE;
	}

	/**
	 * @return String
	 * @see org.tc.osgi.bundle.utils.conf.AbstractPropertyFile#getConfFile()
	 */
	@Override
	public String getConfFile() {
		return TemplatePropertyFile.TEMPLATE_FILE;
	}

	/**
	 * @return String
	 * @see org.tc.osgi.bundle.utils.conf.AbstractPropertyFile#getXMLFile()
	 */
	@Override
	public String getXMLFile() {
		return TemplatePropertyFile.getInstance().getConfigDirectory() + getConfFile();
	}

}
