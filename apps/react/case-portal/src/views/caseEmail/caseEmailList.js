import { useState, useEffect } from 'react';
import MainCard from 'components/MainCard';
import Box from '@mui/material/Box';
import { DataGrid } from '@mui/x-data-grid';
import { useTranslation } from 'react-i18next';
import { EmailService } from '../../services';
import { useSession } from 'SessionStoreContext';

export const CaseEmailsList = ({ caseInstanceBusinessKey }) => {
    const [emails, setEmails] = useState([]);
    const { t } = useTranslation();
    const keycloak = useSession();

    useEffect(() => {
        EmailService.getAllByBusinessKey(keycloak, caseInstanceBusinessKey)
            .then((data) => {
                setEmails(data);
            })
            .catch((err) => {
                console.log(err.message);
            });
    }, [caseInstanceBusinessKey]);

    const columns = [
        { field: 'from', headerName: t('pages.emails.datagrid.from'), width: 300 },
        { field: 'to', headerName: t('pages.emails.datagrid.to'), width: 300 },
        { field: 'text', headerName: t('pages.emails.datagrid.text'), width: 220 }
    ];

    return (
        <div style={{ height: 650, width: '100%' }}>
            <MainCard sx={{ mt: 2 }} content={false}>
                <Box>
                    <DataGrid
                        sx={{ height: 650, width: '100%', backgroundColor: '#ffffff', mt: 1 }}
                        rows={emails}
                        columns={columns}
                        pageSize={10}
                        rowsPerPageOptions={[10]}
                        getRowId={(row) => row._id.$oid}
                    />
                </Box>
            </MainCard>
        </div>
    );
};
