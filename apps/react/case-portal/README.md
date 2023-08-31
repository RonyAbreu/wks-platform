# case-portal-admin-react

Describe global configs about this project.

## Configure i18n

Add new entry on <b>i18n/pt_br.js</b> and <b>i18n/en_us.js</b>

## Using i18n

```js
...
import { useTranslation } from 'react-i18next';

const ExamplePage = () => {
    const { t } = useTranslation();

    return <div>{t('pages.dashboard.title')}</div>;
};
...
```

## References

[React internationalization (i18n)](https://www.i18next.com)
